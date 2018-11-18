import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
<<<<<<< HEAD
import { MatButtonModule, MatToolbarModule, MatSidenavModule, MatIconModule, MatListModule, MatTabsModule, MatCardModule, MatCheckbox, MatCheckboxModule } from '@angular/material';
=======
import { MatButtonModule, MatToolbarModule, MatSidenavModule, MatIconModule, MatListModule } from '@angular/material';
import { HttpClientModule } from '@angular/common/http'
>>>>>>> API

import { AppComponent } from './app.component';
import { MainNavComponent } from './main-nav/main-nav.component';
import { FormsModule} from '@angular/forms';
// import { HttpModule} from '@angular/http';
import { LayoutModule } from '@angular/cdk/layout';
import { MainContainerComponent } from './main-container/main-container.component';
import { MainTabsComponent } from './main-tabs/main-tabs.component';
import { TabPortocoinsComponent } from './tab-portocoins/tab-portocoins.component';
import { TabFaturasComponent } from './tab-faturas/tab-faturas.component';
import { TabOfertasComponent } from './tab-ofertas/tab-ofertas.component';
import { CheckboxComponent } from './checkbox/checkbox.component';

import { ApiService } from "./api-service.service";

@NgModule({
  declarations: [
    AppComponent,
    MainNavComponent,
    MainContainerComponent,
    MainTabsComponent,
    TabPortocoinsComponent,
    TabFaturasComponent,
    TabOfertasComponent,
    CheckboxComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    // HttpModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    LayoutModule,
    MatToolbarModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatTabsModule,
    MatCardModule,
    MatCheckboxModule
  ],
  providers: [ApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
