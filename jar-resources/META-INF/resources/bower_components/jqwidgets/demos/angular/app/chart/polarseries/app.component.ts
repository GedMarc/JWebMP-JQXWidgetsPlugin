﻿import {Component, OnInit, ViewChild} from '@angular/core';

import {jqxChartComponent} from '../../../../../jqwidgets-ts/angular_jqxchart';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent implements OnInit {
    @ViewChild('myChart') myChart: jqxChartComponent;

    chartInstance;
    source: any =
    {
        datatype: 'tab',
        datafields: [
            { name: 'Year' },
            { name: 'HPI' },
            { name: 'BuildCost' },
            { name: 'Population' },
            { name: 'Rate' }
        ],
        url: '../sampledata/homeprices.txt'
    };
    dataAdapter: any = new jqx.dataAdapter(this.source, {
        async: false, autoBind: true, loadError: (xhr: any, status: any, error: any) => {
            alert('Error loading "' + this.source.url + '" : ' + error);
        }
    });
    xAxis: any =
    {
        dataField: 'Year',
        unitInterval: 10,
        maxValue: 2010,
        valuesOnTicks: true,
        labels: { autoRotate: true }
    };

    padding: any = {left: 5, top: 5, right: 5, bottom: 5};

    titlePadding: any = {left: 0, top: 0, right: 0, bottom: 5};
    seriesGroups: any =
    [
        {
            polar: true,
            radius: 120,
            type: 'splinearea',
            valueAxis:
            {
                labels: {
                    formatSettings: { decimalPlaces: 0 },
                    autoRotate: true
                }
            },
            series: [
                { dataField: 'HPI', displayText: 'Real Home Price Index', opacity: 0.7, lineWidth: 1, radius: 2 },
                { dataField: 'BuildCost', displayText: 'Building Cost Index', opacity: 0.7, lineWidth: 1, radius: 2 }
            ]
        }
    ];
    colorsSchemesList: string[] = ['scheme01', 'scheme02', 'scheme03', 'scheme04', 'scheme05', 'scheme06', 'scheme07', 'scheme08'];
    seriesList: string[] = ['splinearea', 'spline', 'column', 'scatter', 'stackedcolumn', 'stackedsplinearea', 'stackedspline'];

    ngOnInit(): void {
        this.chartInstance = this.myChart
    }

    sliderStartAngle(event: any): void {
        let value = event.args.value;
        this.chartInstance.seriesGroups()[0].startAngle = value;
        this.chartInstance.seriesGroups()[0].endAngle = value + 360;
        this.chartInstance.update();
    }

    sliderRadius(event: any): void {
        let value = event.args.value;
        this.chartInstance.seriesGroups()[0].radius = value;
        this.chartInstance.update();
    }

    dropDownListColor(event: any): void {
        let value = event.args.item.value;
        this.chartInstance.colorScheme(value);
    }

    dropDownListSeries(event: any): void {
        let value = event.args.item.value;
        this.chartInstance.seriesGroups()[0].type = value;
        this.chartInstance.update();
    }
}
