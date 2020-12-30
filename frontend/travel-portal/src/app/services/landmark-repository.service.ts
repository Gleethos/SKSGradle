import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Landmark } from '../entities/Landmark';

const BASE_URL = "http://localhost:5555/api/stat"

@Injectable({
  providedIn: 'root'
})
export class LandmarkRepositoryService {

  constructor(private http: HttpClient) { }

  public get landmarks() {
    return this.http.get<Landmark[]>(`${BASE_URL}/landmarks`);
  }
}
