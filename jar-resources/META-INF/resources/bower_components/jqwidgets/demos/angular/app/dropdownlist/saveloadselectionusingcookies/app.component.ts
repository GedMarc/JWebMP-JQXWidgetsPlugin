import {Component} from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent {
    index: any = jqx.cookie.cookie('jqxDropDownList_jqxWidget');
    source: any = {
        datatype: 'json',
        datafields: [
            {name: 'CompanyName'},
            {name: 'ContactName'}
        ],
        id: 'id',
        url: '../sampledata/customers.txt'
    };
    dataAdapter: any = new jqx.dataAdapter(this.source);

    constructor() {
        if (this.index == undefined) this.index = 0;
    }

    listOnSelect(event: any): void {
        jqx.cookie.cookie('jqxDropDownList_jqxWidget', event.args.index);
    }
}

