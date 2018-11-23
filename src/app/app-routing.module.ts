import { IntestazioneComponent } from '../components/intestazione/intestazione.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import {RouterModule, Routes} from '@angular/router';
import { LoginComponent } from '../components/login/login.component';
import { HomeAdminComponent } from '../components/home-admin/home-admin.component';
import { HomeDoctorComponent } from '../components/home-doctor/home-doctor.component';
import { HomeDimComponent } from '../components/home-dim/home-dim.component';
import { SignupComponent } from '../components/signup/signup.component';
import { ReportDriverComponent } from '../components/report-driver/report-driver.component';
import { CarComponent } from '../components/car/car.component';
import { AddCarComponent } from '../components/addCar/addCar.component';
import { ReportHystoryComponent } from '../components/report-hystory/report-hystory.component';
import { ReportOwnerComponent } from '../components/report-owner/report-owner.component';
import { ReportNearComponent } from '../components/report-near/report-near.component';
import { PaymentComponent } from '../components/payment/payment.component';
import { ExtensionStopsComponent } from '../components/extension-stops/extension-stops.component';
import { FindCarplaceComponent } from '../components/find-carplace/find-carplace.component';
import { ManagementParkComponent } from '../components/management-park/management-park.component';
import { UsefulNumbersComponent } from '../components/useful-numbers/useful-numbers.component';
import { LegislationsComponent } from '../components/legislations/legislations.component';
import { ManagementSlotComponent } from '../components/management-slot/management-slot.component';
import { GestionePatologieComponent } from '../components/gestionePatologie/gestionePatologie.component';
import { ReadPatologiaComponent } from '../components/readPatologia/readPatologia.component';
import { InsertPatologiaComponent } from '../components/insertPatologia/insertPatologia.component';
import { UpdatePatologiaComponent } from '../components/updatePatologia/updatePatologia.component';
import { GestioneDatiBiomediciComponent } from '../components/gestioneDatiBiomedici/gestioneDatiBiomedici.component';
import { ReadDatiBiomediciComponent } from '../components/readDatiBiomedici/readDatiBiomedici.component';
import { InsertDatiBiomediciComponent } from '../components/insertDatiBiomedici/insertDatiBiomedici.component';
import { UpdateDatiBiomediciComponent } from '../components/updateDatiBiomedici/updateDatiBiomedici.component';
import { GestioneSintomoComponent} from '../components/gestioneSintomo/gestioneSintomo.component';
import { ReadSintomoComponent } from '../components/readSintomo/readSintomo.component';
import { InsertSintomoComponent } from '../components/insertSintomo/insertSintomo.component';
import { UpdateSintomoComponent } from '../components/updateSintomo/updateSintomo.component';
import { EsameComponent } from '../components/esame/esame.component';
import { InsertEsameComponent } from '../components/home-dim/insertEsame/insertEsame.component';
import { UpdateEsameComponent } from '../components/updateEsame/updateEsame.component';
import { GestioneEsameComponent } from '../components/gestioneEsame/gestioneEsame.component';
import { ErbaComponent } from '../components/erba/erba.component';
import { AddErbaComponent } from '../components/addErba/addErba.component';
import { UpdateErbaComponent } from 'src/components/updateErba/updateErba.component';
import { GestioneMedicoComponent } from '../components/gestioneMedico/gestioneMedico.component';
import { UpdateMedicoComponent } from '../components/updateMedico/updateMedico.component';
import { NewMedicoComponent } from '../components/newMedico/newMedico.component';
import { SensoreComponent } from '../components/sensori/sensori.component';
import { AddSensoreComponent } from '../components/addSensore/addSensore.component';
import { UpdateSensoreComponent } from '../components/updateSensore/updateSensore.component';
import { GestioneErbeComponent } from '../components/gestioneErbe/gestioneErbe.component';
import { GestioneSensoriComponent } from '../components/gestioneSensori/gestioneSensori.component';



const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'homeAdmin', component: HomeAdminComponent},
  {path: 'homeDoctor', component: HomeDoctorComponent},
  {path: 'homeDim', component: HomeDimComponent},
  {path: 'signup', component: SignupComponent},
  {path: 'car', component: CarComponent},
  {path: 'addCar', component: AddCarComponent},
  {path: 'reportDriver', component: ReportDriverComponent},
  {path: 'reportHystory', component: ReportHystoryComponent},
  {path: 'reportOwner', component: ReportOwnerComponent},
  {path: 'reportNear', component: ReportNearComponent},
  {path: 'findCarPlace', component: FindCarplaceComponent},
  {path: 'extensionStops', component: ExtensionStopsComponent},
  {path: 'reportDriver', component: ReportDriverComponent},
  {path: 'paymentsHystory', component: PaymentComponent},
  {path: 'managementPark', component: ManagementParkComponent},
  {path: 'usefulNumbers', component: UsefulNumbersComponent},
  {path: 'legislations', component: LegislationsComponent},
  {path: 'intestazione', component: IntestazioneComponent},
  {path: 'managementSlot', component: ManagementSlotComponent},
  {path: 'addErba', component: AddErbaComponent},
  {path: 'erba', component: ErbaComponent},
  {path: 'updateErba', component: UpdateErbaComponent},
  {path: 'esame', component: EsameComponent},
  {path: 'insertEsame', component: InsertEsameComponent},
  {path: 'updateEsame', component: UpdateEsameComponent},
  {path: 'gestioneEsame', component: GestioneEsameComponent},
  {path: 'gestionePatologie', component: GestionePatologieComponent},
  {path: 'readPatologia', component: ReadPatologiaComponent},
  {path: 'insertPatologia', component: InsertPatologiaComponent},
 {path: 'updatePatologia', component: UpdatePatologiaComponent},
  {path: 'gestioneSintomo', component: GestioneSintomoComponent},
  {path: 'readSintomo', component: ReadSintomoComponent},
  {path: 'insertSintomo', component: InsertSintomoComponent},
  {path: 'updateSintomo', component: UpdateSintomoComponent},
  {path: 'gestioneMedico', component: GestioneMedicoComponent},
  {path: 'updateMedico', component: UpdateMedicoComponent},
  {path: 'newMedico', component: NewMedicoComponent},
 {path: 'gestioneDatiBiomedici', component: GestioneDatiBiomediciComponent},
 {path: 'readDatiBiomedici', component: ReadDatiBiomediciComponent},
 {path: 'insertDatiBiomedici', component: InsertDatiBiomediciComponent},
 {path: 'updateDatiBiomedici', component: UpdateDatiBiomediciComponent},
  {path: 'sensori', component: SensoreComponent},
  {path: 'addSensore', component: AddSensoreComponent},
  {path: 'updateSensore', component: UpdateSensoreComponent},
  {path: 'gestioneErbe', component: GestioneErbeComponent},
  {path: 'gestioneSensori', component: GestioneSensoriComponent},
  
];

@NgModule({
  exports: [RouterModule],
  imports: [RouterModule.forRoot(routes, {useHash: true, onSameUrlNavigation: 'reload'})],
  declarations: []
})
export class AppRoutingModule { }
