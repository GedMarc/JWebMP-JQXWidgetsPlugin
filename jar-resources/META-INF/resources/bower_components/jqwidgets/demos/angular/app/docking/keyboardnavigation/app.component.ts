import {AfterViewInit, Component, ViewChild} from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})

export class AppComponent implements AfterViewInit {
    @ViewChild('myDocking') myDocking;
    jqxDockingComponent;

    ngAfterViewInit(): void {
        this.myDocking.showAllCollapseButtons();
        this.myDocking.focus();
    }
}
