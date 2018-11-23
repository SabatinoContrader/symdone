import * as intestazioneComponent from '../components/intestazione/intestazione.component';
import { LoginComponent } from "../components/login/login.component";
import { HomeAdminComponent } from "../components/home-admin/home-admin.component";
import { GestioneMedicoComponent } from "../components/gestioneMedico/gestioneMedico.component";
import { UpdateMedicoComponent } from "../components/updateMedico/updateMedico.component";
import { NewMedicoComponent } from '../components/newMedico/newMedico.component';
import { FormsModule } from "@angular/forms";
import { NgModule } from "@angular/core";
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from "./app-routing.module";
import { UserService } from "../services/user.service";
import {BrowserModule} from '@angular/platform-browser';
import { AppComponent } from "./app.component";
import { HomeDoctorComponent } from "../components/home-doctor/home-doctor.component";
import { HomeDimComponent } from "../components/home-dim/home-dim.component";
import { SignupComponent } from "../components/signup/signup.component";
import { ReportDriverComponent } from "../components/report-driver/report-driver.component";
import { ReportService } from "../services/report.service";
import { CarComponent } from "../components/car/car.component";
import { CarService } from "../services/car.service";
import { AddCarComponent } from "../components/addCar/addCar.component";
import { ReportHystoryComponent } from "../components/report-hystory/report-hystory.component";
import { ReportOwnerComponent } from "../components/report-owner/report-owner.component";
import { ReportNearComponent } from "../components/report-near/report-near.component";
import { PaymentComponent } from "../components/payment/payment.component";
import { PaymentService } from "../services/payment.service";
import { ExtensionStopsComponent } from "../components/extension-stops/extension-stops.component";
import { ExtensionStopsRowComponent } from "../components/extension-stops-row/extension-stops-row.component";
import { FindCarplaceComponent } from "../components/find-carplace/find-carplace.component";
import { AgmCoreModule } from '@agm/core';
import { GoogleMapService } from "../services/google-map.service";
import { ManagementParkComponent } from "../components/management-park/management-park.component";
import { LegislationsComponent } from "../components/legislations/legislations.component";
import { UsefulNumbersComponent } from "../components/useful-numbers/useful-numbers.component";
import { ManagementSlotComponent } from '../components/management-slot/management-slot.component';
import { SlotService } from '../services/slot.service';
import { ErbaComponent } from '../components/erba/erba.component';
import { ErbaService } from '../services/erba.service';
import { AddErbaComponent } from '../components/addErba/addErba.component';
import { UpdateErbaComponent } from '../components/updateErba/updateErba.component';
import { EsameComponent } from '../components/esame/esame.component';
import { EsameService } from '../services/esame.service';
import { InsertEsameComponent } from '../components/home-dim/insertEsame/insertEsame.component';
import { UpdateEsameComponent } from '../components/updateEsame/updateEsame.component';
import { GestioneEsameComponent } from '../components/gestioneEsame/gestioneEsame.component';
import { InsertPatologiaComponent } from '../components/insertPatologia/insertPatologia.component';
import { UpdatePatologiaComponent } from '../components/updatePatologia/updatePatologia.component';
import { PatologiaService } from '../services/patologia.service';
import { GestionePatologieComponent } from '../components/gestionePatologie/gestionePatologie.component';
import { ReadPatologiaComponent } from '../components/readPatologia/readPatologia.component';
import { GestioneSintomoComponent} from '../components/gestioneSintomo/gestioneSintomo.component';
import { SintomoService } from '../services/sintomo.service';
import { ReadSintomoComponent } from '../components/readSintomo/readSintomo.component';
import { InsertSintomoComponent } from '../components/insertSintomo/insertSintomo.component';
import { UpdateSintomoComponent } from '../components/updateSintomo/updateSintomo.component';
import { GestioneDatiBiomediciComponent } from '../components/gestioneDatiBiomedici/gestioneDatiBiomedici.component';
import { DatiBiomediciService } from '../services/datiBiomedici.service';
import { ReadDatiBiomediciComponent } from '../components/readDatiBiomedici/readDatiBiomedici.component';
import { InsertDatiBiomediciComponent } from '../components/insertDatiBiomedici/insertDatiBiomedici.component';
import { UpdateDatiBiomediciComponent } from '../components/updateDatiBiomedici/updateDatiBiomedici.component';
import { SensoreComponent } from '../components/sensori/sensori.component';
import { AddSensoreComponent } from '../components/addSensore/addSensore.component';
import { SensoreService } from '../services/sensore.service';
import { UpdateSensoreComponent } from '../components/updateSensore/updateSensore.component';
import { GestioneErbeComponent } from '../components/gestioneErbe/gestioneErbe.component';
import { GestioneSensoriComponent } from '../components/gestioneSensori/gestioneSensori.component';




import { MedicoService } from 'src/services/medico.service';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeAdminComponent,
    HomeDoctorComponent,
    HomeDimComponent,
    GestioneMedicoComponent,
    UpdateMedicoComponent,
    NewMedicoComponent,
    SignupComponent,
    ReportDriverComponent,
    CarComponent,
    AddCarComponent,
    ReportHystoryComponent,
    ReportOwnerComponent,
    ReportNearComponent,
    PaymentComponent,
    ExtensionStopsComponent,
    ExtensionStopsRowComponent,
    FindCarplaceComponent,
    ManagementParkComponent,
    LegislationsComponent,
    UsefulNumbersComponent,
    intestazioneComponent.IntestazioneComponent,
    ErbaComponent,
    AddErbaComponent,
    UpdateErbaComponent,
    ManagementSlotComponent,
    EsameComponent,
     InsertEsameComponent,
     UpdateEsameComponent,
     GestioneEsameComponent,
    GestionePatologieComponent,
    ReadPatologiaComponent,
    InsertPatologiaComponent,
   UpdatePatologiaComponent,
    GestioneSintomoComponent,
    ReadSintomoComponent,
    InsertSintomoComponent,
    UpdateSintomoComponent,
   GestioneDatiBiomediciComponent,
   ReadDatiBiomediciComponent,
   InsertDatiBiomediciComponent,
   UpdateDatiBiomediciComponent,
    SensoreComponent,
    AddSensoreComponent,
    UpdateSensoreComponent,
    GestioneErbeComponent,
    GestioneSensoriComponent,
  
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyAUf_fIZF0iu40Uiwhj3RhFE3Kd1KrWUFw',
      libraries: ["places"]
    })
  ],
  providers: [UserService,
     ReportService, 
     CarService,
     PaymentService, 
     GoogleMapService, 
     SlotService,
     EsameService,
     ErbaService,
     ReportService,
     CarService,
     PaymentService, 
     GoogleMapService, 
     SlotService,
     PatologiaService,
     DatiBiomediciService,
     SensoreService,
     SintomoService],
  bootstrap: [AppComponent]
})

export class AppModule { }
