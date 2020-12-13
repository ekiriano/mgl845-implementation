/**
 */
package mgl845;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Agence#getId <em>Id</em>}</li>
 *   <li>{@link mgl845.Agence#getNbVoitureDisponibles <em>Nb Voiture Disponibles</em>}</li>
 *   <li>{@link mgl845.Agence#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.Agence#getAgencedepart <em>Agencedepart</em>}</li>
 *   <li>{@link mgl845.Agence#getAgencearivee <em>Agencearivee</em>}</li>
 *   <li>{@link mgl845.Agence#getTransfet <em>Transfet</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getAgence()
 * @model
 * @generated
 */
public interface Agence extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mgl845.Mgl845Package#getAgence_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mgl845.Agence#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Nb Voiture Disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Voiture Disponibles</em>' attribute.
	 * @see #setNbVoitureDisponibles(int)
	 * @see mgl845.Mgl845Package#getAgence_NbVoitureDisponibles()
	 * @model
	 * @generated
	 */
	int getNbVoitureDisponibles();

	/**
	 * Sets the value of the '{@link mgl845.Agence#getNbVoitureDisponibles <em>Nb Voiture Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Voiture Disponibles</em>' attribute.
	 * @see #getNbVoitureDisponibles()
	 * @generated
	 */
	void setNbVoitureDisponibles(int value);

	/**
	 * Returns the value of the '<em><b>Voiture</b></em>' containment reference list.
	 * The list contents are of type {@link mgl845.Voiture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voiture</em>' containment reference list.
	 * @see mgl845.Mgl845Package#getAgence_Voiture()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Voiture> getVoiture();

	/**
	 * Returns the value of the '<em><b>Agencedepart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agencedepart</em>' reference.
	 * @see #setAgencedepart(AgenceDepart)
	 * @see mgl845.Mgl845Package#getAgence_Agencedepart()
	 * @model required="true"
	 * @generated
	 */
	AgenceDepart getAgencedepart();

	/**
	 * Sets the value of the '{@link mgl845.Agence#getAgencedepart <em>Agencedepart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agencedepart</em>' reference.
	 * @see #getAgencedepart()
	 * @generated
	 */
	void setAgencedepart(AgenceDepart value);

	/**
	 * Returns the value of the '<em><b>Agencearivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agencearivee</em>' reference.
	 * @see #setAgencearivee(AgenceArivee)
	 * @see mgl845.Mgl845Package#getAgence_Agencearivee()
	 * @model required="true"
	 * @generated
	 */
	AgenceArivee getAgencearivee();

	/**
	 * Sets the value of the '{@link mgl845.Agence#getAgencearivee <em>Agencearivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agencearivee</em>' reference.
	 * @see #getAgencearivee()
	 * @generated
	 */
	void setAgencearivee(AgenceArivee value);

	/**
	 * Returns the value of the '<em><b>Transfet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Transfet#getAgence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfet</em>' reference.
	 * @see #setTransfet(Transfet)
	 * @see mgl845.Mgl845Package#getAgence_Transfet()
	 * @see mgl845.Transfet#getAgence
	 * @model opposite="agence"
	 * @generated
	 */
	Transfet getTransfet();

	/**
	 * Sets the value of the '{@link mgl845.Agence#getTransfet <em>Transfet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfet</em>' reference.
	 * @see #getTransfet()
	 * @generated
	 */
	void setTransfet(Transfet value);

} // Agence
