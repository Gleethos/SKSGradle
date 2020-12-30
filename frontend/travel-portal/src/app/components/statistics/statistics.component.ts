import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Landmark } from 'src/app/entities/Landmark';
import { LandmarkRepositoryService } from 'src/app/services/landmark-repository.service';

@Component({
  selector: 'app-statistics',
  templateUrl: './statistics.component.html',
  styleUrls: ['./statistics.component.scss']
})
export class StatisticsComponent implements OnInit {

  public landmarks$: Observable<Landmark[]>;

  constructor(private repo: LandmarkRepositoryService) {
    this.landmarks$ = repo.landmarks;
    console.log(repo.landmarks);
  }
  ngOnInit(): void {
  }

}
