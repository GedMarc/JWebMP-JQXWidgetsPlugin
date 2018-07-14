import {AfterViewInit, Component, ElementRef, ViewChild} from '@angular/core';

import {jqxListBoxComponent} from '../../../../../jqwidgets-ts/angular_jqxlistbox';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent implements AfterViewInit {
    @ViewChild('jqxListBox') myListBox: jqxListBoxComponent;
    @ViewChild('select') select: ElementRef;
    updating = false;

    ngAfterViewInit() {
        this.myListBox.loadFromSelect('select');
    }

    change(event: any): void {
        this.updating = true;
        let index = this.select.nativeElement.selectedIndex;
        this.myListBox.selectIndex(index);
        this.myListBox.ensureVisible(index);
        this.updating = false;
    };

    selectItem(event: any): void {
        if (event.args && !this.updating) {
            // select the item in the 'select' tag.
            let index = event.args.item.index;
            this.select.nativeElement.selectedIndex = index;
        }
    };
}
