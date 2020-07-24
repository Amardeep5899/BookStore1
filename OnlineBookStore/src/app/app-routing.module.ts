import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListallbookComponent } from './listallbook/listallbook.component';


const routes: Routes = [
  {
    path:'listallbook',component:ListallbookComponent
    
  },
  {
    path:'',redirectTo:'/listallbook',pathMatch:'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
