import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BlogpostListComponent } from './components/blogpost-list/blogpost-list.component';
import { HttpClientModule } from '@angular/common/http';
import { BlogpostDetailComponent } from './components/blogpost-detail/blogpost-detail.component';
import { BlogpostCreateComponent } from './components/blogpost-create/blogpost-create.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    BlogpostListComponent,
    BlogpostDetailComponent,
    BlogpostCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
