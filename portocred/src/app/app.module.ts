import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule, MatToolbarModule, MatSidenavModule, MatIconModule, MatListModule, MatTabsModule, MatCardModule, MatCheckbox, MatCheckboxModule } from '@angular/material';

import { AppComponent } from './app.component';
import { MainNavComponent } from './main-nav/main-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MainContainerComponent } from './main-container/main-container.component';
import { MainTabsComponent } from './main-tabs/main-tabs.component';
import { TabPortocoinsComponent } from './tab-portocoins/tab-portocoins.component';
import { TabFaturasComponent } from './tab-faturas/tab-faturas.component';
import { TabOfertasComponent } from './tab-ofertas/tab-ofertas.component';
import { CheckboxComponent } from './checkbox/checkbox.component';

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
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
