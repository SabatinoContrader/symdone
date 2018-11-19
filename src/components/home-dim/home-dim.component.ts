import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-dim',
  templateUrl: './home-dim.component.html',
  styleUrls: ['./home-dim.component.css']
})

export class HomeDimComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  logout(){
    sessionStorage.clear();
    this.router.navigateByUrl("/login");
  }

}
