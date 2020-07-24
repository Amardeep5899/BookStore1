import { Bookcategory } from './bookcategory';

export class Bookinformation {
    bookId:number;
    title:string;
    author:string;
    description:string;
    isbnNumber:string;
    publishDate:Date;
    lastUpdateTime:Date;
    price:number;
    category:Bookcategory;
}


