/**
 */
package mgl845;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agence Arivee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.AgenceArivee#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.AgenceArivee#getRetour <em>Retour</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getAgenceArivee()
 * @model
 * @generated
 */
public interface AgenceArivee extends EObject {
	/**
	 * Returns the value of the '<em><b>Voiture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Voiture#getAgencearivee <em>Agencearivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voiture</em>' reference.
	 * @see #setVoiture(Voiture)
	 * @see mgl845.Mgl845Package#getAgenceArivee_Voiture()
	 * @see mgl845.Voiture#getAgencearivee
	 * @model opposite="agencearivee"
	 * @generated
	 */
	Voiture getVoiture();

	/**
	 * Sets the value of the '{@link mgl845.AgenceArivee#getVoiture <em>Voiture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voiture</em>' reference.
	 * @see #getVoiture()
	 * @generated
	 */
	void setVoiture(Voiture value);

	/**
	 * Returns the value of the '<em><b>Retour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Retour#getAgencearivee <em>Agencearivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retour</em>' reference.
	 * @see #setRetour(Retour)
	 * @see mgl845.Mgl845Package#getAgenceArivee_Retour()
	 * @see mgl845.Retour#getAgencearivee
	 * @model opposite="agencearivee"
	 * @generated
	 */
	Retour getRetour();

	/**
	 * Sets the value of the '{@link mgl845.AgenceArivee#getRetour <em>Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retour</em>' reference.
	 * @see #getRetour()
	 * @generated
	 */
	void setRetour(Retour value);

} // AgenceArivee
