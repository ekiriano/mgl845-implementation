/**
 */
package mgl845;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Voiture#getTransfet <em>Transfet</em>}</li>
 *   <li>{@link mgl845.Voiture#getAgencearivee <em>Agencearivee</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getVoiture()
 * @model
 * @generated
 */
public interface Voiture extends EObject {

	/**
	 * Returns the value of the '<em><b>Transfet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Transfet#getVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfet</em>' reference.
	 * @see #setTransfet(Transfet)
	 * @see mgl845.Mgl845Package#getVoiture_Transfet()
	 * @see mgl845.Transfet#getVoiture
	 * @model opposite="voiture"
	 * @generated
	 */
	Transfet getTransfet();

	/**
	 * Sets the value of the '{@link mgl845.Voiture#getTransfet <em>Transfet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfet</em>' reference.
	 * @see #getTransfet()
	 * @generated
	 */
	void setTransfet(Transfet value);

	/**
	 * Returns the value of the '<em><b>Agencearivee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.AgenceArivee#getVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agencearivee</em>' reference.
	 * @see #setAgencearivee(AgenceArivee)
	 * @see mgl845.Mgl845Package#getVoiture_Agencearivee()
	 * @see mgl845.AgenceArivee#getVoiture
	 * @model opposite="voiture"
	 * @generated
	 */
	AgenceArivee getAgencearivee();

	/**
	 * Sets the value of the '{@link mgl845.Voiture#getAgencearivee <em>Agencearivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agencearivee</em>' reference.
	 * @see #getAgencearivee()
	 * @generated
	 */
	void setAgencearivee(AgenceArivee value);
} // Voiture
