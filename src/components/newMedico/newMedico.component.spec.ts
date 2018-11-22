import { NO_ERRORS_SCHEMA } from "@angular/core";
import { NewMedicoComponent } from "./newMedico.component";
import { ComponentFixture, TestBed } from "@angular/core/testing";

describe("NewMedicoComponent", () => {

  let fixture: ComponentFixture<NewMedicoComponent>;
  let component: NewMedicoComponent;
  beforeEach(() => {
    TestBed.configureTestingModule({
      schemas: [NO_ERRORS_SCHEMA],
      providers: [
      ],
      declarations: [NewMedicoComponent]
    });

    fixture = TestBed.createComponent(NewMedicoComponent);
    component = fixture.componentInstance;

  });

  it("should be able to create component instance", () => {
    expect(component).toBeDefined();
  });
  
});