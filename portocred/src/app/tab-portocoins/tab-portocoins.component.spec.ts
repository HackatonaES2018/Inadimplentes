import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabPortocoinsComponent } from './tab-portocoins.component';

describe('TabPortocoinsComponent', () => {
  let component: TabPortocoinsComponent;
  let fixture: ComponentFixture<TabPortocoinsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabPortocoinsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabPortocoinsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
