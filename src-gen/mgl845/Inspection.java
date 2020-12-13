/**
 */
package mgl845;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Inspection#getId <em>Id</em>}</li>
 *   <li>{@link mgl845.Inspection#getDetailnspectiom <em>Detailnspectiom</em>}</li>
 *   <li>{@link mgl845.Inspection#isEstEnInfractiom <em>Est En Infractiom</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getInspection()
 * @model
 * @generated
 */
public interface Inspection extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mgl845.Mgl845Package#getInspection_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mgl845.Inspection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Detailnspectiom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailnspectiom</em>' attribute.
	 * @see #setDetailnspectiom(String)
	 * @see mgl845.Mgl845Package#getInspection_Detailnspectiom()
	 * @model
	 * @generated
	 */
	String getDetailnspectiom();

	/**
	 * Sets the value of the '{@link mgl845.Inspection#getDetailnspectiom <em>Detailnspectiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailnspectiom</em>' attribute.
	 * @see #getDetailnspectiom()
	 * @generated
	 */
	void setDetailnspectiom(String value);

	/**
	 * Returns the value of the '<em><b>Est En Infractiom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est En Infractiom</em>' attribute.
	 * @see #setEstEnInfractiom(boolean)
	 * @see mgl845.Mgl845Package#getInspection_EstEnInfractiom()
	 * @model
	 * @generated
	 */
	boolean isEstEnInfractiom();

	/**
	 * Sets the value of the '{@link mgl845.Inspection#isEstEnInfractiom <em>Est En Infractiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est En Infractiom</em>' attribute.
	 * @see #isEstEnInfractiom()
	 * @generated
	 */
	void setEstEnInfractiom(boolean value);

} // Inspection
