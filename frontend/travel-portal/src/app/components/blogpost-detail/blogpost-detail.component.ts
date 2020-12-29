import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';
import { BlogPost } from 'src/app/entities/BlogPost';
import { BlogpostRepositoryService } from 'src/app/services/blogpost-repository.service';

@Component({
  selector: 'app-blogpost-detail',
  templateUrl: './blogpost-detail.component.html',
  styleUrls: ['./blogpost-detail.component.scss']
})
export class BlogpostDetailComponent implements OnInit {

  constructor(private repo: BlogpostRepositoryService, private route: ActivatedRoute) { }

  post? : BlogPost;

  private subscription?: Subscription

  ngOnInit() {
    this.subscription = this.route.params.subscribe(params => {
      this.repo.find(+params["id"]).subscribe(post => {
        this.post = post
      })
    })
  }

  ngOnDestroy() {
    this.subscription.unsubscribe()
  }

}
