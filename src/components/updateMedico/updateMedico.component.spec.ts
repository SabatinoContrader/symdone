import { NO_ERRORS_SCHEMA } from "@angular/core";
import { UpdateMedicoComponent } from "./updateMedico.component";
import { ComponentFixture, TestBed } from "@angular/core/testing";

describe("UpdateMedicoComponent", () => {

  let fixture: ComponentFixture<UpdateMedicoComponent>;
  let component: UpdateMedicoComponent;
  beforeEach(() => {
    TestBed.configureTestingModule({
      schemas: [NO_ERRORS_SCHEMA],
      providers: [
      ],
      declarations: [UpdateMedicoComponent]
    });

    fixture = TestBed.createComponent(UpdateMedicoComponent);
    component = fixture.componentInstance;

  });

  it("should be able to create component instance", () => {
    expect(component).toBeDefined();
  });
  
});