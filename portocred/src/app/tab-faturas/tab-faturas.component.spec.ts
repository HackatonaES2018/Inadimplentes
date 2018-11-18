import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabFaturasComponent } from './tab-faturas.component';

describe('TabFaturasComponent', () => {
  let component: TabFaturasComponent;
  let fixture: ComponentFixture<TabFaturasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabFaturasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabFaturasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
