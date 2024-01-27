import {Component, OnInit} from '@angular/core';
import {SecurityService} from "./services/security.service";
import {KeycloakService} from "keycloak-angular";
import {KeycloakProfile} from "keycloak-js";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  public profile? : KeycloakProfile;
  constructor( public kcService:KeycloakService) {
  }
  ngOnInit() {
    if(this.kcService.isLoggedIn()){
      this.kcService.loadUserProfile().then(profile=>{
        this.profile=profile;
      });
    }
  }

  title = 'customer-front-angular-app';

  async login()  {
    await this.kcService.login({
      redirectUri: window.location.origin
    });
  }
   logout() {
      this.kcService.logout(window.location.origin);
  }
}
