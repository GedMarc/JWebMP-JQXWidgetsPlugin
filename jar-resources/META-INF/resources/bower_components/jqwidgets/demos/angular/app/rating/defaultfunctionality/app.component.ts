import {Component, ElementRef, ViewChild} from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent {
    @ViewChild('rate') rate: ElementRef;

    change(event: any): void {
        let rate = this.rate.nativeElement;

        rate.innerHTML = '<span> ' + event.value + '</span>';
    }
}
