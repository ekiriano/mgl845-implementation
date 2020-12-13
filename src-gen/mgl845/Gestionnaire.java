/**
 */
package mgl845;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Gestionnaire#getAgence <em>Agence</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getGestionnaire()
 * @model
 * @generated
 */
public interface Gestionnaire extends Personne {
	/**
	 * Returns the value of the '<em><b>Agence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agence</em>' reference.
	 * @see #setAgence(Agence)
	 * @see mgl845.Mgl845Package#getGestionnaire_Agence()
	 * @model
	 * @generated
	 */
	Agence getAgence();

	/**
	 * Sets the value of the '{@link mgl845.Gestionnaire#getAgence <em>Agence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agence</em>' reference.
	 * @see #getAgence()
	 * @generated
	 */
	void setAgence(Agence value);

} // Gestionnaire
