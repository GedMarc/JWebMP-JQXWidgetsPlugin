﻿import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {AppComponent} from './app.component';
import {DataTableModule} from '../../modules/datatable.module';

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        BrowserModule, CommonModule, DataTableModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})

export class AppModule { }


