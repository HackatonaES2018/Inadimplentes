node {

    currentBuild.result = "SUCCESS"

    try {

        stage('Delete Repos Dietoterapia'){
            sh 'ssh root@10.32.223.4 -p 5439 "rm -rf /opt/docker/dietoterapia/front"'
            sh 'ssh root@10.32.223.4 -p 5439 "rm -rf /opt/docker/dietoterapia/back"'
        }

        stage('Clone Repos Dietoterapia Front e Bach'){
           sh 'ssh root@10.32.223.4 -p 5439 "git clone --depth 1 --branch homo http://projetos@www.tools.ages.pucrs.br/dietoterapia/front.git /opt/docker/dietoterapia/front"'
           sh 'ssh root@10.32.223.4 -p 5439 "git clone --depth 1 --branch homo http://projetos@www.tools.ages.pucrs.br/dietoterapia/back.git /opt/docker/dietoterapia/back"'
        }

        stage('Install and Build Dietoterapia Front Angular'){
            sh 'ssh root@10.32.223.4 -p 5439 "/opt/docker/dietoterapia/back/ic.sh"'
        }

        stage('Down Images Maven, DB, Api and Web'){
           sh 'ssh root@10.32.223.4 -p 5439 "cd /opt/docker/dietoterapia/back; docker-compose down;  docker-compose -f docker-compose-api.yml down; docker-compose -f docker-compose-web.yml down"'
        }

        stage('Build and Up Docker Image Mave'){
           sh 'ssh root@10.32.223.4 -p 5439 "cd /opt/docker/dietoterapia/back; docker-compose up --build"'
        }

        stage('Build and Up Docker Image Api'){
           sh 'ssh root@10.32.223.4 -p 5439 "cd /opt/docker/dietoterapia/back; docker-compose -f docker-compose-api.yml up --build -d"'
        }

        stage('Build and Up Docker Image Web'){
           sh 'ssh root@10.32.223.4 -p 5439 "cd /opt/docker/dietoterapia/back; docker-compose -f docker-compose-web.yml up --build -d"'
        }

        stage('Success'){
            mail body: 'project build successful in HML',
                     from: 'jenkinsx@ages.com',
                     replyTo: 'cassio.trindade@pucrs.br',
                     subject: 'Success CI Dietoterapia',
                     to: 'cassio.trindade@pucrs.br'
        }

    }
    catch (err) {

        currentBuild.result = "FAILURE"

            mail body: "project build error is here: ${env.BUILD_URL}" ,
            from: 'jenkinsx@ages.com',
            replyTo: 'cassio.trindade@pucrs.br',
            subject: 'Error CI Dietoterapia',
            to: 'cassio.trindade@pucrs.br'

        throw err
    }

}

