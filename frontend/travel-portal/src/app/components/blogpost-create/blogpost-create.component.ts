import { Component, OnInit } from '@angular/core';
import { Form, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { Author } from 'src/app/entities/Author';
import { Landmark } from 'src/app/entities/Landmark';
import { BlogpostRepositoryService } from 'src/app/services/blogpost-repository.service';

@Component({
  selector: 'app-blogpost-create',
  templateUrl: './blogpost-create.component.html',
  styleUrls: ['./blogpost-create.component.scss']
})
export class BlogpostCreateComponent implements OnInit {

  public authors$: Observable<Author[]>;
  public landmarks$: Observable<Landmark[]>;
  public blogPostForm : FormGroup;

  constructor(private repo: BlogpostRepositoryService, private fb: FormBuilder) { }

  ngOnInit(): void {
    this.authors$ = this.repo.authors
    this.landmarks$ = this.repo.landmarks
    this.blogPostForm = this.fb.group({
      title: ['', [Validators.required]],
      description: [''],
      content: [''],
      authorId: [-1],
      landmarkId: [-1]
    });
  }


  submit(){
    this.repo.create(this.blogPostForm.value);
    }

}
