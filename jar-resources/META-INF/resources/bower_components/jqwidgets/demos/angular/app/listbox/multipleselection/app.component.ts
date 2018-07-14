﻿import {AfterViewInit, Component, ElementRef, ViewChild} from '@angular/core';

import {jqxListBoxComponent} from '../../../../../jqwidgets-ts/angular_jqxlistbox';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent implements AfterViewInit {
    @ViewChild('jqxListBox') myListBox: jqxListBoxComponent;
    @ViewChild('selectionLog') selectionLog: ElementRef;
    source: string[] = [
        "Affogato",
        "Americano",
        "Bicerin",
        "Breve",
        "Café Bombón",
        "Café au lait",
        "Caffé Corretto",
        "Café Crema",
        "Caffé Latte",
        "Caffé macchiato",
        "Café mélange",
        "Coffee milk",
        "Cafe mocha",
        "Cappuccino",
        "Carajillo",
        "Cortado",
        "Cuban espresso",
        "Espresso",
        "Eiskaffee",
        "The Flat White",
        "Frappuccino",
        "Galao",
        "Greek frappé coffee",
        "Iced Coffee﻿",
        "Indian filter coffee",
        "Instant coffee",
        "Irish coffee",
        "Liqueur coffee"
    ];

    ngAfterViewInit() {
        this.myListBox.selectIndex(2);
        this.myListBox.selectIndex(5);
        this.myListBox.selectIndex(7);
    }

    displaySelectedItems() {
        let items = this.myListBox.getSelectedItems();
        let selection = 'Selected Items: ';
        for (let i = 0; i < items.length; i++) {
            selection += items[i].label + (i < items.length - 1 ? ', ' : '');
        }
        this.selectionLog.nativeElement.innerHTML = selection;
    }

    change(event: any): void {
        this.displaySelectedItems();
    };
}
