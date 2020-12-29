import { TestBed } from '@angular/core/testing';

import { BlogpostRepositoryService } from './blogpost-repository.service';

describe('BlogpostRepositoryService', () => {
  let service: BlogpostRepositoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BlogpostRepositoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
