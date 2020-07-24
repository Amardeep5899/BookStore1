import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListallbookComponent } from './listallbook.component';

describe('ListallbookComponent', () => {
  let component: ListallbookComponent;
  let fixture: ComponentFixture<ListallbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListallbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListallbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
