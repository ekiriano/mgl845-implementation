/**
 */
package mgl845.util;

import mgl845.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mgl845.Mgl845Package
 * @generated
 */
public class Mgl845Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mgl845Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mgl845Switch() {
		if (modelPackage == null) {
			modelPackage = Mgl845Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Mgl845Package.PERSONNE: {
			Personne personne = (Personne) theEObject;
			T result = casePersonne(personne);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.CLIENT: {
			Client client = (Client) theEObject;
			T result = caseClient(client);
			if (result == null)
				result = casePersonne(client);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.GESTIONNAIRE: {
			Gestionnaire gestionnaire = (Gestionnaire) theEObject;
			T result = caseGestionnaire(gestionnaire);
			if (result == null)
				result = casePersonne(gestionnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.COMMIS: {
			Commis commis = (Commis) theEObject;
			T result = caseCommis(commis);
			if (result == null)
				result = casePersonne(commis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.DOSSIER_CLIENT: {
			DossierClient dossierClient = (DossierClient) theEObject;
			T result = caseDossierClient(dossierClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.AGENCE_ARIVEE: {
			AgenceArivee agenceArivee = (AgenceArivee) theEObject;
			T result = caseAgenceArivee(agenceArivee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.AGENCE: {
			Agence agence = (Agence) theEObject;
			T result = caseAgence(agence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.AGENCE_DEPART: {
			AgenceDepart agenceDepart = (AgenceDepart) theEObject;
			T result = caseAgenceDepart(agenceDepart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.RESERVATION: {
			Reservation reservation = (Reservation) theEObject;
			T result = caseReservation(reservation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.CATEGORIE: {
			Categorie categorie = (Categorie) theEObject;
			T result = caseCategorie(categorie);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.PAIEMENT: {
			Paiement paiement = (Paiement) theEObject;
			T result = casePaiement(paiement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.VOITURE: {
			Voiture voiture = (Voiture) theEObject;
			T result = caseVoiture(voiture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.TRANSFET: {
			Transfet transfet = (Transfet) theEObject;
			T result = caseTransfet(transfet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.RETOUR: {
			Retour retour = (Retour) theEObject;
			T result = caseRetour(retour);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mgl845Package.INSPECTION: {
			Inspection inspection = (Inspection) theEObject;
			T result = caseInspection(inspection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonne(Personne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestionnaire(Gestionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommis(Commis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossierClient(DossierClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence Arivee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence Arivee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgenceArivee(AgenceArivee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgence(Agence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence Depart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence Depart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgenceDepart(AgenceDepart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservation(Reservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorie(Categorie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paiement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paiement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaiement(Paiement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voiture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoiture(Voiture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfet(Transfet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetour(Retour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inspection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inspection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInspection(Inspection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Mgl845Switch
