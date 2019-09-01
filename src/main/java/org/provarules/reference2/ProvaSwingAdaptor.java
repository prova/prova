package org.provarules.reference2;

import org.provarules.agent2.ProvaReagent;
import org.provarules.agent2.ProvaThreadpoolEnum;
import org.provarules.kernel2.*;
import org.provarules.kernel2.messaging.ProvaMessenger;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

/**
 * Adaptor for Swing events. This class is created and used by ProvaReagentImpl.
 */
public class ProvaSwingAdaptor implements
        ActionListener,
        ChangeListener,
        MouseListener,
        MouseMotionListener {

    private ProvaReagent prova;

    private ProvaKnowledgeBase kb;

    @SuppressWarnings("unused")
    private ProvaMessenger messenger;

    public ProvaSwingAdaptor(ProvaReagent prova) {
        this.prova = prova;
        this.kb = prova.getKb();
        this.messenger = prova.getMessenger();
    }

    public void listen(String type, Object target) {
        prova.setAllowedShutdown(false);
        if (type.equals("action"))
            ((javax.swing.AbstractButton) target).addActionListener(this);
        else if (type.equals("change"))
            ((javax.swing.AbstractButton) target).addChangeListener(this);
        else if (type.equals("mouse"))
            ((java.awt.Component) target).addMouseListener(this);
        else if (type.equals("motion"))
            ((java.awt.Component) target).addMouseMotionListener(this);
    }

    public void unlisten(String type, Object target) {
        if (type.equals("action"))
            ((javax.swing.AbstractButton) target).removeActionListener(this);
        else if (type.equals("change"))
            ((javax.swing.AbstractButton) target).removeChangeListener(this);
        else if (type.equals("mouse"))
            ((java.awt.Component) target).removeMouseListener(this);
        else if (type.equals("motion"))
            ((java.awt.Component) target).removeMouseMotionListener(this);
    }

    /**
     * actionPerformed
     *
     * @param e ActionEvent
     */
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        Object cmd = e.getActionCommand();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("action"),
                        ProvaConstantImpl.create(cmd),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    /**
     * stateChanged
     *
     * @param e ChangeEvent
     */
    public void stateChanged(ChangeEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("change"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    /**
     * mouseClicked
     *
     * @param e MouseEvent
     */
    public void mouseClicked(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("mouse"),
                        ProvaConstantImpl.create("clicked"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    /**
     * mouseEntered
     *
     * @param e MouseEvent
     */
    public void mouseEntered(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("mouse"),
                        ProvaConstantImpl.create("entered"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    /**
     * mouseExited
     *
     * @param e MouseEvent
     */
    public void mouseExited(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("mouse"),
                        ProvaConstantImpl.create("exited"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    /**
     * mousePressed
     *
     * @param e MouseEvent
     */
    public void mousePressed(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("mouse"),
                        ProvaConstantImpl.create("pressed"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    /**
     * mouseReleased
     *
     * @param e MouseEvent
     */
    public void mouseReleased(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("mouse"),
                        ProvaConstantImpl.create("released"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("motion"),
                        ProvaConstantImpl.create("dragged"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Object src = e.getSource();
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create("s"),
                ProvaConstantImpl.create("task"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("swing"),
                ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("motion"),
                        ProvaConstantImpl.create("moved"),
                        ProvaConstantImpl.create(src),
                        ProvaConstantImpl.create(e)})});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")});
        prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
    }
}
