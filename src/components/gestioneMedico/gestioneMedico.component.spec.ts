import { NO_ERRORS_SCHEMA } from "@angular/core";
import { GestioneMedicoComponent } from "./gestioneMedico.component";
import { ComponentFixture, TestBed } from "@angular/core/testing";

describe("GestioneMedicoComponent", () => {

  let fixture: ComponentFixture<GestioneMedicoComponent>;
  let component: GestioneMedicoComponent;
  beforeEach(() => {
    TestBed.configureTestingModule({
      schemas: [NO_ERRORS_SCHEMA],
      providers: [
      ],
      declarations: [GestioneMedicoComponent]
    });

    fixture = TestBed.createComponent(GestioneMedicoComponent);
    component = fixture.componentInstance;

  });

  it("should be able to create component instance", () => {
    expect(component).toBeDefined();
  });
  
});
