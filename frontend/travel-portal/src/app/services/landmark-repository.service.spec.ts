import { TestBed } from '@angular/core/testing';

import { LandmarkRepositoryService } from './landmark-repository.service';

describe('LandmarkRepositoryService', () => {
  let service: LandmarkRepositoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LandmarkRepositoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
