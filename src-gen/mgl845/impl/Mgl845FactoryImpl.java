/**
 */
package mgl845.impl;

import mgl845.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mgl845FactoryImpl extends EFactoryImpl implements Mgl845Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mgl845Factory init() {
		try {
			Mgl845Factory theMgl845Factory = (Mgl845Factory) EPackage.Registry.INSTANCE
					.getEFactory(Mgl845Package.eNS_URI);
			if (theMgl845Factory != null) {
				return theMgl845Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mgl845FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mgl845FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Mgl845Package.PERSONNE:
			return createPersonne();
		case Mgl845Package.CLIENT:
			return createClient();
		case Mgl845Package.GESTIONNAIRE:
			return createGestionnaire();
		case Mgl845Package.COMMIS:
			return createCommis();
		case Mgl845Package.DOSSIER_CLIENT:
			return createDossierClient();
		case Mgl845Package.AGENCE_ARIVEE:
			return createAgenceArivee();
		case Mgl845Package.AGENCE:
			return createAgence();
		case Mgl845Package.AGENCE_DEPART:
			return createAgenceDepart();
		case Mgl845Package.RESERVATION:
			return createReservation();
		case Mgl845Package.LOCATION:
			return createLocation();
		case Mgl845Package.CATEGORIE:
			return createCategorie();
		case Mgl845Package.PAIEMENT:
			return createPaiement();
		case Mgl845Package.VOITURE:
			return createVoiture();
		case Mgl845Package.TRANSFET:
			return createTransfet();
		case Mgl845Package.RETOUR:
			return createRetour();
		case Mgl845Package.INSPECTION:
			return createInspection();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne createPersonne() {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire createGestionnaire() {
		GestionnaireImpl gestionnaire = new GestionnaireImpl();
		return gestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commis createCommis() {
		CommisImpl commis = new CommisImpl();
		return commis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DossierClient createDossierClient() {
		DossierClientImpl dossierClient = new DossierClientImpl();
		return dossierClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceArivee createAgenceArivee() {
		AgenceAriveeImpl agenceArivee = new AgenceAriveeImpl();
		return agenceArivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence createAgence() {
		AgenceImpl agence = new AgenceImpl();
		return agence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceDepart createAgenceDepart() {
		AgenceDepartImpl agenceDepart = new AgenceDepartImpl();
		return agenceDepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie createCategorie() {
		CategorieImpl categorie = new CategorieImpl();
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paiement createPaiement() {
		PaiementImpl paiement = new PaiementImpl();
		return paiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture createVoiture() {
		VoitureImpl voiture = new VoitureImpl();
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transfet createTransfet() {
		TransfetImpl transfet = new TransfetImpl();
		return transfet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retour createRetour() {
		RetourImpl retour = new RetourImpl();
		return retour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspection createInspection() {
		InspectionImpl inspection = new InspectionImpl();
		return inspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mgl845Package getMgl845Package() {
		return (Mgl845Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mgl845Package getPackage() {
		return Mgl845Package.eINSTANCE;
	}

} //Mgl845FactoryImpl
