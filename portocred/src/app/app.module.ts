import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule, MatToolbarModule, MatSidenavModule, MatIconModule, MatListModule } from '@angular/material';
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { MainNavComponent } from './main-nav/main-nav.component';
import { FormsModule} from '@angular/forms';
// import { HttpModule} from '@angular/http';
import { LayoutModule } from '@angular/cdk/layout';
import { MainContainerComponent } from './main-container/main-container.component';

import { ApiService } from "./api-service.service";

@NgModule({
  declarations: [
    AppComponent,
    MainNavComponent,
    MainContainerComponent
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
    MatListModule
  ],
  providers: [ApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
