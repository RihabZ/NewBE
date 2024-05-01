package com.rihab.interventions.dto;

import java.util.Date;
import java.util.UUID;

import com.rihab.interventions.entities.Cause;
import com.rihab.interventions.entities.Demandeur;
import com.rihab.interventions.entities.Equipement;
import com.rihab.interventions.entities.Intervention;
import com.rihab.interventions.entities.InterventionNature;
import com.rihab.interventions.entities.InterventionType;
import com.rihab.interventions.entities.Technicien;
import com.rihab.interventions.entities.Ticket;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
	
	
	private String interCode ;
    
   private String interDesignation;

 
   private Date dateCreation;


 
   private String description;


   private Date datePrevue;

  
   
  
   private String sousGarantie;

 
   private String sousContrat;


  
   private String interPriorite;

   
   private String machineArret;

   private Date dateArret;
   private Long dureeArret;

   private long idInter;
 
  private String interStatut;
  
  private Equipement equipement;
  
  private InterventionNature interventionNature;
  
private Demandeur demandeur;
private Technicien technicien;
private Intervention intervention;
  

private long idIntervention;


private Date dateCloture;


private String descriptionPanne;


private Date dtRealisation;



private Long dureeRealisation;

private String compteRendu;


private String interventionObservation;


private double interMtHebergement;
private double interMtDeplacement;

private Long difficulté;


private InterventionType interventionType;



private Cause cause;










}

