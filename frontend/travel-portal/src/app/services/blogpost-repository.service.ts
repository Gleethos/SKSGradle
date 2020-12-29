import { Injectable } from '@angular/core';
import {BlogPost} from '../entities/BlogPost';
import { Subject } from 'rxjs';
import { map, tap, repeatWhen } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { Author } from '../entities/Author';
import { Landmark } from '../entities/Landmark';

@Injectable({
  providedIn: 'root'
})
export class BlogpostRepositoryService {
 

  constructor(private http: HttpClient) { }

  public get posts() {
    return this.http.get<BlogPost[]>(`http://localhost:7500/resources/blog/all`);
  }

  public find(id: number) {
    return this.http.get<BlogPost>(`http://localhost:7500/resources/blog/${id}`);
  }

  public get authors() {
    return this.http.get<Author[]>(`http://localhost:7500/resources/blog/authors`);
  }

  public get landmarks() {
    return this.http.get<Landmark[]>(`http://localhost:7500/resources/blog/landmarks`);
  }
  
  create(value: any) {
    this.http.post(`http://localhost:7500/resources/blog/`, value).subscribe();
  }
}
