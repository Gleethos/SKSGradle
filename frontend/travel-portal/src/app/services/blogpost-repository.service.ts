import { Injectable } from '@angular/core';
import {BlogPost} from '../entities/BlogPost';
import { Subject } from 'rxjs';
import { map, tap, repeatWhen } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { Author } from '../entities/Author';
import { Landmark } from '../entities/Landmark';

const BASE_URL = "http://localhost:5555/api/blog"

@Injectable({
  providedIn: 'root'
})
export class BlogpostRepositoryService {

  constructor(private http: HttpClient) { }

  public get posts() {
    return this.http.get<BlogPost[]>(`${BASE_URL}/posts`);
  }

  public find(id: number) {
    return this.http.get<BlogPost>(`${BASE_URL}/post/${id}`);
  }

  public get authors() {
    return this.http.get<Author[]>(`${BASE_URL}/authors`);
  }

  public get landmarks() {
    return this.http.get<Landmark[]>(`${BASE_URL}/landmarks`);
  }
  
  create(value: any) {
    this.http.post(`${BASE_URL}/post/create`, value).subscribe();
  }
}
