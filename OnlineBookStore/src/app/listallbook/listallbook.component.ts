import { Component, OnInit } from '@angular/core';
import { Bookinformation } from '../bookinformation';
import { Bookcategory } from '../bookcategory';
import { BookstoreService } from '../bookstore.service';

@Component({
  selector: 'app-listallbook',
  templateUrl: './listallbook.component.html',
  styleUrls: ['./listallbook.component.css']
})
export class ListallbookComponent implements OnInit {

  bookInformation:Bookinformation[]=[];
  bookCategory:Bookcategory;
  info:string;
  errorInfo:any;
  

  constructor(private bookStoreService: BookstoreService) { }
//To print all book data
  ngOnInit() {
    console.log("inside ngOninit listAllBook component");
    this.bookStoreService.listAllBooks().subscribe(data => {
      this.bookInformation=data;},error=>{this.errorInfo=error.error});
    console.log(this.errorInfo);
  
}

}
