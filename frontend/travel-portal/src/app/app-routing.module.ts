import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BlogpostCreateComponent } from './components/blogpost-create/blogpost-create.component';
import { BlogpostDetailComponent } from './components/blogpost-detail/blogpost-detail.component';
import { BlogpostListComponent } from './components/blogpost-list/blogpost-list.component';
import { StatisticsComponent } from './components/statistics/statistics.component';

const routes: Routes = [
  {path: 'list', component: BlogpostListComponent},
  {path: 'post/:id', component: BlogpostDetailComponent},
  {path: 'create', component: BlogpostCreateComponent},
  {path: 'stat', component: StatisticsComponent},
  {path: '**', redirectTo: 'list'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
