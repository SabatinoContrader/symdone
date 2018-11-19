import { NO_ERRORS_SCHEMA } from "@angular/core";
import { HomeAdminComponent } from "./home-admin.component";
import { ComponentFixture, TestBed } from "@angular/core/testing";

describe("HomeAdminComponent", () => {

  let fixture: ComponentFixture<HomeAdminComponent>;
  let component: HomeAdminComponent;
  beforeEach(() => {
    TestBed.configureTestingModule({
      schemas: [NO_ERRORS_SCHEMA],
      providers: [
      ],
      declarations: [HomeAdminComponent]
    });

    fixture = TestBed.createComponent(HomeAdminComponent);
    component = fixture.componentInstance;

  });

  it("should be able to create component instance", () => {
    expect(component).toBeDefined();
  });
  
});
