import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeDimComponent } from './home-dim.component';

describe('HomeDimComponent', () => {
  let component: HomeDimComponent;
  let fixture: ComponentFixture<HomeDimComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeDimComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeDimComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
