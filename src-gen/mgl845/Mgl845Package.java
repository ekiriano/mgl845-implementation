/**
 */
package mgl845;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mgl845.Mgl845Factory
 * @model kind="package"
 * @generated
 */
public interface Mgl845Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mgl845";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mgl845";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mgl845";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mgl845Package eINSTANCE = mgl845.impl.Mgl845PackageImpl.init();

	/**
	 * The meta object id for the '{@link mgl845.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.PersonneImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__ID = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__ADRESSE = 3;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.ClientImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ID = PERSONNE__ID;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ADRESSE = PERSONNE__ADRESSE;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__RESERVATION = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dossierclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__DOSSIERCLIENT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reserver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___RESERVER = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Louer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___LOUER = PERSONNE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link mgl845.impl.GestionnaireImpl <em>Gestionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.GestionnaireImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getGestionnaire()
	 * @generated
	 */
	int GESTIONNAIRE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__ID = PERSONNE__ID;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__ADRESSE = PERSONNE__ADRESSE;

	/**
	 * The feature id for the '<em><b>Agence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__AGENCE = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gestionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gestionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.CommisImpl <em>Commis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.CommisImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getCommis()
	 * @generated
	 */
	int COMMIS = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__ID = PERSONNE__ID;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__ADRESSE = PERSONNE__ADRESSE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__LOCATION = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__RESERVATION = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Commis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Commis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.DossierClientImpl <em>Dossier Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.DossierClientImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getDossierClient()
	 * @generated
	 */
	int DOSSIER_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Numero Dossier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT__NUMERO_DOSSIER = 0;

	/**
	 * The feature id for the '<em><b>Nb Infraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT__NB_INFRACTION = 1;

	/**
	 * The feature id for the '<em><b>Inspection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT__INSPECTION = 2;

	/**
	 * The number of structural features of the '<em>Dossier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dossier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.AgenceAriveeImpl <em>Agence Arivee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.AgenceAriveeImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getAgenceArivee()
	 * @generated
	 */
	int AGENCE_ARIVEE = 5;

	/**
	 * The feature id for the '<em><b>Voiture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_ARIVEE__VOITURE = 0;

	/**
	 * The feature id for the '<em><b>Retour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_ARIVEE__RETOUR = 1;

	/**
	 * The number of structural features of the '<em>Agence Arivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_ARIVEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agence Arivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_ARIVEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.AgenceImpl <em>Agence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.AgenceImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getAgence()
	 * @generated
	 */
	int AGENCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Nb Voiture Disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__NB_VOITURE_DISPONIBLES = 1;

	/**
	 * The feature id for the '<em><b>Voiture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__VOITURE = 2;

	/**
	 * The feature id for the '<em><b>Agencedepart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__AGENCEDEPART = 3;

	/**
	 * The feature id for the '<em><b>Agencearivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__AGENCEARIVEE = 4;

	/**
	 * The feature id for the '<em><b>Transfet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__TRANSFET = 5;

	/**
	 * The number of structural features of the '<em>Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.AgenceDepartImpl <em>Agence Depart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.AgenceDepartImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getAgenceDepart()
	 * @generated
	 */
	int AGENCE_DEPART = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_DEPART__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Agence Depart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_DEPART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agence Depart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_DEPART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.ReservationImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 8;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Retour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RETOUR = 1;

	/**
	 * The feature id for the '<em><b>Paiement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PAIEMENT = 2;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CATEGORIE = 3;

	/**
	 * The feature id for the '<em><b>Commis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__COMMIS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ID = 5;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.LocationImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Duree Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DUREE_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Voiture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__VOITURE = 1;

	/**
	 * The feature id for the '<em><b>Commis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COMMIS = 2;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DATE_DEBUT = 3;

	/**
	 * The feature id for the '<em><b>Est Approuvee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EST_APPROUVEE = 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.CategorieImpl <em>Categorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.CategorieImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 10;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__RESERVATION = 0;

	/**
	 * The number of structural features of the '<em>Categorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Categorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.PaiementImpl <em>Paiement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.PaiementImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getPaiement()
	 * @generated
	 */
	int PAIEMENT = 11;

	/**
	 * The feature id for the '<em><b>Accompte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIEMENT__ACCOMPTE = 0;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIEMENT__TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIEMENT__RESERVATION = 2;

	/**
	 * The number of structural features of the '<em>Paiement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Paiement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.VoitureImpl <em>Voiture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.VoitureImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getVoiture()
	 * @generated
	 */
	int VOITURE = 12;

	/**
	 * The feature id for the '<em><b>Transfet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__TRANSFET = 0;

	/**
	 * The feature id for the '<em><b>Agencearivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__AGENCEARIVEE = 1;

	/**
	 * The number of structural features of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.TransfetImpl <em>Transfet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.TransfetImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getTransfet()
	 * @generated
	 */
	int TRANSFET = 13;

	/**
	 * The feature id for the '<em><b>Voiture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFET__VOITURE = 0;

	/**
	 * The feature id for the '<em><b>Agence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFET__AGENCE = 1;

	/**
	 * The feature id for the '<em><b>Date Transfert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFET__DATE_TRANSFERT = 2;

	/**
	 * The number of structural features of the '<em>Transfet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transfet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.RetourImpl <em>Retour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.RetourImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getRetour()
	 * @generated
	 */
	int RETOUR = 14;

	/**
	 * The feature id for the '<em><b>Inspection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__INSPECTION = 0;

	/**
	 * The feature id for the '<em><b>Agencearivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__AGENCEARIVEE = 1;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Date Retour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__DATE_RETOUR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__ID = 4;

	/**
	 * The number of structural features of the '<em>Retour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Retour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgl845.impl.InspectionImpl <em>Inspection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgl845.impl.InspectionImpl
	 * @see mgl845.impl.Mgl845PackageImpl#getInspection()
	 * @generated
	 */
	int INSPECTION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Detailnspectiom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__DETAILNSPECTIOM = 1;

	/**
	 * The feature id for the '<em><b>Est En Infractiom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__EST_EN_INFRACTIOM = 2;

	/**
	 * The number of structural features of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mgl845.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see mgl845.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mgl845.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see mgl845.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Personne#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mgl845.Personne#getId()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Id();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Personne#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see mgl845.Personne#getAdresse()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Adresse();

	/**
	 * Returns the meta object for class '{@link mgl845.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see mgl845.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link mgl845.Client#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see mgl845.Client#getReservation()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Reservation();

	/**
	 * Returns the meta object for the containment reference '{@link mgl845.Client#getDossierclient <em>Dossierclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dossierclient</em>'.
	 * @see mgl845.Client#getDossierclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Dossierclient();

	/**
	 * Returns the meta object for the '{@link mgl845.Client#reserver() <em>Reserver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserver</em>' operation.
	 * @see mgl845.Client#reserver()
	 * @generated
	 */
	EOperation getClient__Reserver();

	/**
	 * Returns the meta object for the '{@link mgl845.Client#louer() <em>Louer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Louer</em>' operation.
	 * @see mgl845.Client#louer()
	 * @generated
	 */
	EOperation getClient__Louer();

	/**
	 * Returns the meta object for class '{@link mgl845.Gestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestionnaire</em>'.
	 * @see mgl845.Gestionnaire
	 * @generated
	 */
	EClass getGestionnaire();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Gestionnaire#getAgence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agence</em>'.
	 * @see mgl845.Gestionnaire#getAgence()
	 * @see #getGestionnaire()
	 * @generated
	 */
	EReference getGestionnaire_Agence();

	/**
	 * Returns the meta object for class '{@link mgl845.Commis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commis</em>'.
	 * @see mgl845.Commis
	 * @generated
	 */
	EClass getCommis();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Commis#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see mgl845.Commis#getReservation()
	 * @see #getCommis()
	 * @generated
	 */
	EReference getCommis_Reservation();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Commis#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see mgl845.Commis#getLocation()
	 * @see #getCommis()
	 * @generated
	 */
	EReference getCommis_Location();

	/**
	 * Returns the meta object for class '{@link mgl845.DossierClient <em>Dossier Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier Client</em>'.
	 * @see mgl845.DossierClient
	 * @generated
	 */
	EClass getDossierClient();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.DossierClient#getNumeroDossier <em>Numero Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Dossier</em>'.
	 * @see mgl845.DossierClient#getNumeroDossier()
	 * @see #getDossierClient()
	 * @generated
	 */
	EAttribute getDossierClient_NumeroDossier();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.DossierClient#getNbInfraction <em>Nb Infraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Infraction</em>'.
	 * @see mgl845.DossierClient#getNbInfraction()
	 * @see #getDossierClient()
	 * @generated
	 */
	EAttribute getDossierClient_NbInfraction();

	/**
	 * Returns the meta object for the containment reference list '{@link mgl845.DossierClient#getInspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inspection</em>'.
	 * @see mgl845.DossierClient#getInspection()
	 * @see #getDossierClient()
	 * @generated
	 */
	EReference getDossierClient_Inspection();

	/**
	 * Returns the meta object for class '{@link mgl845.AgenceArivee <em>Agence Arivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence Arivee</em>'.
	 * @see mgl845.AgenceArivee
	 * @generated
	 */
	EClass getAgenceArivee();

	/**
	 * Returns the meta object for the reference '{@link mgl845.AgenceArivee#getVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voiture</em>'.
	 * @see mgl845.AgenceArivee#getVoiture()
	 * @see #getAgenceArivee()
	 * @generated
	 */
	EReference getAgenceArivee_Voiture();

	/**
	 * Returns the meta object for the reference '{@link mgl845.AgenceArivee#getRetour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retour</em>'.
	 * @see mgl845.AgenceArivee#getRetour()
	 * @see #getAgenceArivee()
	 * @generated
	 */
	EReference getAgenceArivee_Retour();

	/**
	 * Returns the meta object for class '{@link mgl845.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence</em>'.
	 * @see mgl845.Agence
	 * @generated
	 */
	EClass getAgence();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Agence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mgl845.Agence#getId()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_Id();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Agence#getNbVoitureDisponibles <em>Nb Voiture Disponibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Voiture Disponibles</em>'.
	 * @see mgl845.Agence#getNbVoitureDisponibles()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_NbVoitureDisponibles();

	/**
	 * Returns the meta object for the containment reference list '{@link mgl845.Agence#getVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voiture</em>'.
	 * @see mgl845.Agence#getVoiture()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_Voiture();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Agence#getAgencedepart <em>Agencedepart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agencedepart</em>'.
	 * @see mgl845.Agence#getAgencedepart()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_Agencedepart();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Agence#getAgencearivee <em>Agencearivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agencearivee</em>'.
	 * @see mgl845.Agence#getAgencearivee()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_Agencearivee();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Agence#getTransfet <em>Transfet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfet</em>'.
	 * @see mgl845.Agence#getTransfet()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_Transfet();

	/**
	 * Returns the meta object for class '{@link mgl845.AgenceDepart <em>Agence Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence Depart</em>'.
	 * @see mgl845.AgenceDepart
	 * @generated
	 */
	EClass getAgenceDepart();

	/**
	 * Returns the meta object for the containment reference list '{@link mgl845.AgenceDepart#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see mgl845.AgenceDepart#getLocation()
	 * @see #getAgenceDepart()
	 * @generated
	 */
	EReference getAgenceDepart_Location();

	/**
	 * Returns the meta object for class '{@link mgl845.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see mgl845.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Reservation#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see mgl845.Reservation#getClient()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Client();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Reservation#getRetour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retour</em>'.
	 * @see mgl845.Reservation#getRetour()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Retour();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Reservation#getPaiement <em>Paiement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paiement</em>'.
	 * @see mgl845.Reservation#getPaiement()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Paiement();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Reservation#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorie</em>'.
	 * @see mgl845.Reservation#getCategorie()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Categorie();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Reservation#getCommis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commis</em>'.
	 * @see mgl845.Reservation#getCommis()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Commis();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Reservation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mgl845.Reservation#getId()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Id();

	/**
	 * Returns the meta object for class '{@link mgl845.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see mgl845.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Location#getDureeLocation <em>Duree Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree Location</em>'.
	 * @see mgl845.Location#getDureeLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_DureeLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mgl845.Location#getVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Voiture</em>'.
	 * @see mgl845.Location#getVoiture()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Voiture();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Location#getCommis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commis</em>'.
	 * @see mgl845.Location#getCommis()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Commis();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Location#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see mgl845.Location#getDateDebut()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Location#isEstApprouvee <em>Est Approuvee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Approuvee</em>'.
	 * @see mgl845.Location#isEstApprouvee()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_EstApprouvee();

	/**
	 * Returns the meta object for class '{@link mgl845.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorie</em>'.
	 * @see mgl845.Categorie
	 * @generated
	 */
	EClass getCategorie();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Categorie#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see mgl845.Categorie#getReservation()
	 * @see #getCategorie()
	 * @generated
	 */
	EReference getCategorie_Reservation();

	/**
	 * Returns the meta object for class '{@link mgl845.Paiement <em>Paiement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paiement</em>'.
	 * @see mgl845.Paiement
	 * @generated
	 */
	EClass getPaiement();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Paiement#getAccompte <em>Accompte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accompte</em>'.
	 * @see mgl845.Paiement#getAccompte()
	 * @see #getPaiement()
	 * @generated
	 */
	EAttribute getPaiement_Accompte();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Paiement#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see mgl845.Paiement#getTotal()
	 * @see #getPaiement()
	 * @generated
	 */
	EAttribute getPaiement_Total();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Paiement#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see mgl845.Paiement#getReservation()
	 * @see #getPaiement()
	 * @generated
	 */
	EReference getPaiement_Reservation();

	/**
	 * Returns the meta object for class '{@link mgl845.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voiture</em>'.
	 * @see mgl845.Voiture
	 * @generated
	 */
	EClass getVoiture();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Voiture#getTransfet <em>Transfet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfet</em>'.
	 * @see mgl845.Voiture#getTransfet()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_Transfet();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Voiture#getAgencearivee <em>Agencearivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agencearivee</em>'.
	 * @see mgl845.Voiture#getAgencearivee()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_Agencearivee();

	/**
	 * Returns the meta object for class '{@link mgl845.Transfet <em>Transfet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfet</em>'.
	 * @see mgl845.Transfet
	 * @generated
	 */
	EClass getTransfet();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Transfet#getVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voiture</em>'.
	 * @see mgl845.Transfet#getVoiture()
	 * @see #getTransfet()
	 * @generated
	 */
	EReference getTransfet_Voiture();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Transfet#getAgence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agence</em>'.
	 * @see mgl845.Transfet#getAgence()
	 * @see #getTransfet()
	 * @generated
	 */
	EReference getTransfet_Agence();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Transfet#getDateTransfert <em>Date Transfert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Transfert</em>'.
	 * @see mgl845.Transfet#getDateTransfert()
	 * @see #getTransfet()
	 * @generated
	 */
	EAttribute getTransfet_DateTransfert();

	/**
	 * Returns the meta object for class '{@link mgl845.Retour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retour</em>'.
	 * @see mgl845.Retour
	 * @generated
	 */
	EClass getRetour();

	/**
	 * Returns the meta object for the containment reference '{@link mgl845.Retour#getInspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inspection</em>'.
	 * @see mgl845.Retour#getInspection()
	 * @see #getRetour()
	 * @generated
	 */
	EReference getRetour_Inspection();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Retour#getAgencearivee <em>Agencearivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agencearivee</em>'.
	 * @see mgl845.Retour#getAgencearivee()
	 * @see #getRetour()
	 * @generated
	 */
	EReference getRetour_Agencearivee();

	/**
	 * Returns the meta object for the reference '{@link mgl845.Retour#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see mgl845.Retour#getReservation()
	 * @see #getRetour()
	 * @generated
	 */
	EReference getRetour_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Retour#getDateRetour <em>Date Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Retour</em>'.
	 * @see mgl845.Retour#getDateRetour()
	 * @see #getRetour()
	 * @generated
	 */
	EAttribute getRetour_DateRetour();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Retour#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mgl845.Retour#getId()
	 * @see #getRetour()
	 * @generated
	 */
	EAttribute getRetour_Id();

	/**
	 * Returns the meta object for class '{@link mgl845.Inspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection</em>'.
	 * @see mgl845.Inspection
	 * @generated
	 */
	EClass getInspection();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Inspection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mgl845.Inspection#getId()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_Id();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Inspection#getDetailnspectiom <em>Detailnspectiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailnspectiom</em>'.
	 * @see mgl845.Inspection#getDetailnspectiom()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_Detailnspectiom();

	/**
	 * Returns the meta object for the attribute '{@link mgl845.Inspection#isEstEnInfractiom <em>Est En Infractiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est En Infractiom</em>'.
	 * @see mgl845.Inspection#isEstEnInfractiom()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_EstEnInfractiom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mgl845Factory getMgl845Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mgl845.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.PersonneImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__ID = eINSTANCE.getPersonne_Id();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__ADRESSE = eINSTANCE.getPersonne_Adresse();

		/**
		 * The meta object literal for the '{@link mgl845.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.ClientImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__RESERVATION = eINSTANCE.getClient_Reservation();

		/**
		 * The meta object literal for the '<em><b>Dossierclient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__DOSSIERCLIENT = eINSTANCE.getClient_Dossierclient();

		/**
		 * The meta object literal for the '<em><b>Reserver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___RESERVER = eINSTANCE.getClient__Reserver();

		/**
		 * The meta object literal for the '<em><b>Louer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___LOUER = eINSTANCE.getClient__Louer();

		/**
		 * The meta object literal for the '{@link mgl845.impl.GestionnaireImpl <em>Gestionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.GestionnaireImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getGestionnaire()
		 * @generated
		 */
		EClass GESTIONNAIRE = eINSTANCE.getGestionnaire();

		/**
		 * The meta object literal for the '<em><b>Agence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESTIONNAIRE__AGENCE = eINSTANCE.getGestionnaire_Agence();

		/**
		 * The meta object literal for the '{@link mgl845.impl.CommisImpl <em>Commis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.CommisImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getCommis()
		 * @generated
		 */
		EClass COMMIS = eINSTANCE.getCommis();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIS__RESERVATION = eINSTANCE.getCommis_Reservation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIS__LOCATION = eINSTANCE.getCommis_Location();

		/**
		 * The meta object literal for the '{@link mgl845.impl.DossierClientImpl <em>Dossier Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.DossierClientImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getDossierClient()
		 * @generated
		 */
		EClass DOSSIER_CLIENT = eINSTANCE.getDossierClient();

		/**
		 * The meta object literal for the '<em><b>Numero Dossier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER_CLIENT__NUMERO_DOSSIER = eINSTANCE.getDossierClient_NumeroDossier();

		/**
		 * The meta object literal for the '<em><b>Nb Infraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER_CLIENT__NB_INFRACTION = eINSTANCE.getDossierClient_NbInfraction();

		/**
		 * The meta object literal for the '<em><b>Inspection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER_CLIENT__INSPECTION = eINSTANCE.getDossierClient_Inspection();

		/**
		 * The meta object literal for the '{@link mgl845.impl.AgenceAriveeImpl <em>Agence Arivee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.AgenceAriveeImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getAgenceArivee()
		 * @generated
		 */
		EClass AGENCE_ARIVEE = eINSTANCE.getAgenceArivee();

		/**
		 * The meta object literal for the '<em><b>Voiture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_ARIVEE__VOITURE = eINSTANCE.getAgenceArivee_Voiture();

		/**
		 * The meta object literal for the '<em><b>Retour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_ARIVEE__RETOUR = eINSTANCE.getAgenceArivee_Retour();

		/**
		 * The meta object literal for the '{@link mgl845.impl.AgenceImpl <em>Agence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.AgenceImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getAgence()
		 * @generated
		 */
		EClass AGENCE = eINSTANCE.getAgence();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__ID = eINSTANCE.getAgence_Id();

		/**
		 * The meta object literal for the '<em><b>Nb Voiture Disponibles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__NB_VOITURE_DISPONIBLES = eINSTANCE.getAgence_NbVoitureDisponibles();

		/**
		 * The meta object literal for the '<em><b>Voiture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__VOITURE = eINSTANCE.getAgence_Voiture();

		/**
		 * The meta object literal for the '<em><b>Agencedepart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__AGENCEDEPART = eINSTANCE.getAgence_Agencedepart();

		/**
		 * The meta object literal for the '<em><b>Agencearivee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__AGENCEARIVEE = eINSTANCE.getAgence_Agencearivee();

		/**
		 * The meta object literal for the '<em><b>Transfet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__TRANSFET = eINSTANCE.getAgence_Transfet();

		/**
		 * The meta object literal for the '{@link mgl845.impl.AgenceDepartImpl <em>Agence Depart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.AgenceDepartImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getAgenceDepart()
		 * @generated
		 */
		EClass AGENCE_DEPART = eINSTANCE.getAgenceDepart();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_DEPART__LOCATION = eINSTANCE.getAgenceDepart_Location();

		/**
		 * The meta object literal for the '{@link mgl845.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.ReservationImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__CLIENT = eINSTANCE.getReservation_Client();

		/**
		 * The meta object literal for the '<em><b>Retour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__RETOUR = eINSTANCE.getReservation_Retour();

		/**
		 * The meta object literal for the '<em><b>Paiement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__PAIEMENT = eINSTANCE.getReservation_Paiement();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__CATEGORIE = eINSTANCE.getReservation_Categorie();

		/**
		 * The meta object literal for the '<em><b>Commis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__COMMIS = eINSTANCE.getReservation_Commis();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__ID = eINSTANCE.getReservation_Id();

		/**
		 * The meta object literal for the '{@link mgl845.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.LocationImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Duree Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DUREE_LOCATION = eINSTANCE.getLocation_DureeLocation();

		/**
		 * The meta object literal for the '<em><b>Voiture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__VOITURE = eINSTANCE.getLocation_Voiture();

		/**
		 * The meta object literal for the '<em><b>Commis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__COMMIS = eINSTANCE.getLocation_Commis();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DATE_DEBUT = eINSTANCE.getLocation_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Est Approuvee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__EST_APPROUVEE = eINSTANCE.getLocation_EstApprouvee();

		/**
		 * The meta object literal for the '{@link mgl845.impl.CategorieImpl <em>Categorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.CategorieImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getCategorie()
		 * @generated
		 */
		EClass CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIE__RESERVATION = eINSTANCE.getCategorie_Reservation();

		/**
		 * The meta object literal for the '{@link mgl845.impl.PaiementImpl <em>Paiement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.PaiementImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getPaiement()
		 * @generated
		 */
		EClass PAIEMENT = eINSTANCE.getPaiement();

		/**
		 * The meta object literal for the '<em><b>Accompte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIEMENT__ACCOMPTE = eINSTANCE.getPaiement_Accompte();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIEMENT__TOTAL = eINSTANCE.getPaiement_Total();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIEMENT__RESERVATION = eINSTANCE.getPaiement_Reservation();

		/**
		 * The meta object literal for the '{@link mgl845.impl.VoitureImpl <em>Voiture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.VoitureImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getVoiture()
		 * @generated
		 */
		EClass VOITURE = eINSTANCE.getVoiture();

		/**
		 * The meta object literal for the '<em><b>Transfet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__TRANSFET = eINSTANCE.getVoiture_Transfet();

		/**
		 * The meta object literal for the '<em><b>Agencearivee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__AGENCEARIVEE = eINSTANCE.getVoiture_Agencearivee();

		/**
		 * The meta object literal for the '{@link mgl845.impl.TransfetImpl <em>Transfet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.TransfetImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getTransfet()
		 * @generated
		 */
		EClass TRANSFET = eINSTANCE.getTransfet();

		/**
		 * The meta object literal for the '<em><b>Voiture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFET__VOITURE = eINSTANCE.getTransfet_Voiture();

		/**
		 * The meta object literal for the '<em><b>Agence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFET__AGENCE = eINSTANCE.getTransfet_Agence();

		/**
		 * The meta object literal for the '<em><b>Date Transfert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFET__DATE_TRANSFERT = eINSTANCE.getTransfet_DateTransfert();

		/**
		 * The meta object literal for the '{@link mgl845.impl.RetourImpl <em>Retour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.RetourImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getRetour()
		 * @generated
		 */
		EClass RETOUR = eINSTANCE.getRetour();

		/**
		 * The meta object literal for the '<em><b>Inspection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETOUR__INSPECTION = eINSTANCE.getRetour_Inspection();

		/**
		 * The meta object literal for the '<em><b>Agencearivee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETOUR__AGENCEARIVEE = eINSTANCE.getRetour_Agencearivee();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETOUR__RESERVATION = eINSTANCE.getRetour_Reservation();

		/**
		 * The meta object literal for the '<em><b>Date Retour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETOUR__DATE_RETOUR = eINSTANCE.getRetour_DateRetour();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETOUR__ID = eINSTANCE.getRetour_Id();

		/**
		 * The meta object literal for the '{@link mgl845.impl.InspectionImpl <em>Inspection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgl845.impl.InspectionImpl
		 * @see mgl845.impl.Mgl845PackageImpl#getInspection()
		 * @generated
		 */
		EClass INSPECTION = eINSTANCE.getInspection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__ID = eINSTANCE.getInspection_Id();

		/**
		 * The meta object literal for the '<em><b>Detailnspectiom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__DETAILNSPECTIOM = eINSTANCE.getInspection_Detailnspectiom();

		/**
		 * The meta object literal for the '<em><b>Est En Infractiom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__EST_EN_INFRACTIOM = eINSTANCE.getInspection_EstEnInfractiom();

	}

} //Mgl845Package
