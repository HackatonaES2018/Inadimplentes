import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompartilharPortocoinsComponent } from './compartilhar-portocoins.component';

describe('CompartilharPortocoinsComponent', () => {
  let component: CompartilharPortocoinsComponent;
  let fixture: ComponentFixture<CompartilharPortocoinsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompartilharPortocoinsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompartilharPortocoinsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
