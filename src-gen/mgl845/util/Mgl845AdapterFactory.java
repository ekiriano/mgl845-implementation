/**
 */
package mgl845.util;

import mgl845.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mgl845.Mgl845Package
 * @generated
 */
public class Mgl845AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mgl845Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mgl845AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Mgl845Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mgl845Switch<Adapter> modelSwitch = new Mgl845Switch<Adapter>() {
		@Override
		public Adapter casePersonne(Personne object) {
			return createPersonneAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseGestionnaire(Gestionnaire object) {
			return createGestionnaireAdapter();
		}

		@Override
		public Adapter caseCommis(Commis object) {
			return createCommisAdapter();
		}

		@Override
		public Adapter caseDossierClient(DossierClient object) {
			return createDossierClientAdapter();
		}

		@Override
		public Adapter caseAgenceArivee(AgenceArivee object) {
			return createAgenceAriveeAdapter();
		}

		@Override
		public Adapter caseAgence(Agence object) {
			return createAgenceAdapter();
		}

		@Override
		public Adapter caseAgenceDepart(AgenceDepart object) {
			return createAgenceDepartAdapter();
		}

		@Override
		public Adapter caseReservation(Reservation object) {
			return createReservationAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseCategorie(Categorie object) {
			return createCategorieAdapter();
		}

		@Override
		public Adapter casePaiement(Paiement object) {
			return createPaiementAdapter();
		}

		@Override
		public Adapter caseVoiture(Voiture object) {
			return createVoitureAdapter();
		}

		@Override
		public Adapter caseTransfet(Transfet object) {
			return createTransfetAdapter();
		}

		@Override
		public Adapter caseRetour(Retour object) {
			return createRetourAdapter();
		}

		@Override
		public Adapter caseInspection(Inspection object) {
			return createInspectionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Gestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Gestionnaire
	 * @generated
	 */
	public Adapter createGestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Commis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Commis
	 * @generated
	 */
	public Adapter createCommisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.DossierClient <em>Dossier Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.DossierClient
	 * @generated
	 */
	public Adapter createDossierClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.AgenceArivee <em>Agence Arivee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.AgenceArivee
	 * @generated
	 */
	public Adapter createAgenceAriveeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Agence
	 * @generated
	 */
	public Adapter createAgenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.AgenceDepart <em>Agence Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.AgenceDepart
	 * @generated
	 */
	public Adapter createAgenceDepartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Reservation
	 * @generated
	 */
	public Adapter createReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Categorie
	 * @generated
	 */
	public Adapter createCategorieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Paiement <em>Paiement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Paiement
	 * @generated
	 */
	public Adapter createPaiementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Voiture
	 * @generated
	 */
	public Adapter createVoitureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Transfet <em>Transfet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Transfet
	 * @generated
	 */
	public Adapter createTransfetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Retour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Retour
	 * @generated
	 */
	public Adapter createRetourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgl845.Inspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgl845.Inspection
	 * @generated
	 */
	public Adapter createInspectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Mgl845AdapterFactory
