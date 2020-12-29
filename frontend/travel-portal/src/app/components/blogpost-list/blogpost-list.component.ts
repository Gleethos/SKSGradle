import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { BlogPost } from '../../entities/BlogPost';
import { BlogpostRepositoryService } from '../../services/blogpost-repository.service';

@Component({
  selector: 'app-blogpost-list',
  templateUrl: './blogpost-list.component.html',
  styleUrls: ['./blogpost-list.component.scss']
})
export class BlogpostListComponent implements OnInit {
  
  public posts$: Observable<BlogPost[]>;

  constructor(private repo: BlogpostRepositoryService) {
    this.posts$ = repo.posts;
  }
  ngOnInit(): void {
  }

}
