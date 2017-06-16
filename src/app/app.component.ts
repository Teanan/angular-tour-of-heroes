import { Component } from '@angular/core';

import { HeroesComponent } from './heroes.component'
import { HeroService } from 'app/hero.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [HeroService],
})
export class AppComponent {
  title = 'Tour of Heroes';
}
