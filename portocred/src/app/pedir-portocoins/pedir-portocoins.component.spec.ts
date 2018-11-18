import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PedirPortocoinsComponent } from './pedir-portocoins.component';

describe('PedirPortocoinsComponent', () => {
  let component: PedirPortocoinsComponent;
  let fixture: ComponentFixture<PedirPortocoinsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PedirPortocoinsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PedirPortocoinsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
