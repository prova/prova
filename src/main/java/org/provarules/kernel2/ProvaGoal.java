package org.provarules.kernel2;

import java.util.Iterator;
import java.util.List;

public interface ProvaGoal {

    ProvaRule next();

    ProvaLiteral getGoal();

    ProvaUnification nextUnification(ProvaKnowledgeBase kb);

    ProvaRule getQuery();

    void setCut(boolean cut);

    void setGoal(ProvaLiteral top);

    boolean hasNext();

    Iterator<ProvaRule> getIterator();

    void addAnswer(ProvaList terms);

    void addOuterAnswer(ProvaList terms);

    boolean isSingleClause();

    void removeTarget();

    void updateMetadataGoal();

    Object lookupMetadata(String variable, List<ProvaVariable> variables);

    ProvaRule getLastMatch();

    void setLastMatch(ProvaRule lastMatch);

    boolean isCut();

    void update();

    void updateGround();

}
