/**
 */
package mgl845;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mgl845.Mgl845Package
 * @generated
 */
public interface Mgl845Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mgl845Factory eINSTANCE = mgl845.impl.Mgl845FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Gestionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gestionnaire</em>'.
	 * @generated
	 */
	Gestionnaire createGestionnaire();

	/**
	 * Returns a new object of class '<em>Commis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commis</em>'.
	 * @generated
	 */
	Commis createCommis();

	/**
	 * Returns a new object of class '<em>Dossier Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier Client</em>'.
	 * @generated
	 */
	DossierClient createDossierClient();

	/**
	 * Returns a new object of class '<em>Agence Arivee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence Arivee</em>'.
	 * @generated
	 */
	AgenceArivee createAgenceArivee();

	/**
	 * Returns a new object of class '<em>Agence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence</em>'.
	 * @generated
	 */
	Agence createAgence();

	/**
	 * Returns a new object of class '<em>Agence Depart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence Depart</em>'.
	 * @generated
	 */
	AgenceDepart createAgenceDepart();

	/**
	 * Returns a new object of class '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation</em>'.
	 * @generated
	 */
	Reservation createReservation();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorie</em>'.
	 * @generated
	 */
	Categorie createCategorie();

	/**
	 * Returns a new object of class '<em>Paiement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paiement</em>'.
	 * @generated
	 */
	Paiement createPaiement();

	/**
	 * Returns a new object of class '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voiture</em>'.
	 * @generated
	 */
	Voiture createVoiture();

	/**
	 * Returns a new object of class '<em>Transfet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfet</em>'.
	 * @generated
	 */
	Transfet createTransfet();

	/**
	 * Returns a new object of class '<em>Retour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retour</em>'.
	 * @generated
	 */
	Retour createRetour();

	/**
	 * Returns a new object of class '<em>Inspection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspection</em>'.
	 * @generated
	 */
	Inspection createInspection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mgl845Package getMgl845Package();

} //Mgl845Factory
