﻿import {AfterViewInit, Component, ViewChild} from '@angular/core';

import {jqxBarGaugeComponent} from '../../../../../jqwidgets-ts/angular_jqxbargauge';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent implements AfterViewInit {
    @ViewChild('myBarGauge') myBarGauge: jqxBarGaugeComponent;
    settings: any = {
        width: 600,
        height: 600,
        max: 150,
        values: [102, 115, 130, 137],
        colorScheme: 'scheme02',
        tooltip: {
            visible: true,
            formatFunction: (value: string) => {
                let realVal = parseInt(value);
                return ('Year: 2016<br/>Price Index:' + realVal);
            }
        }
    }

    ngAfterViewInit(): void {
        this.myBarGauge.createComponent(this.settings);
    }
}
