import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabOfertasComponent } from './tab-ofertas.component';

describe('TabOfertasComponent', () => {
  let component: TabOfertasComponent;
  let fixture: ComponentFixture<TabOfertasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabOfertasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabOfertasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
